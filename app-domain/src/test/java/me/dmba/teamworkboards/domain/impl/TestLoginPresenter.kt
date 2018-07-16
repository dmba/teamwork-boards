package me.dmba.teamworkboards.domain.impl

import io.reactivex.Completable.complete
import io.reactivex.Completable.error
import me.dmba.teamworkboards.data.model.access.AuthRepo
import me.dmba.teamworkboards.domain.contract.LoginContract
import me.dmba.teamworkboards.domain.extensions.on
import me.dmba.teamworkboards.domain.fixtures.RxFixture
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.doReturn
import org.mockito.Mockito.verify

/**
 * Created by dmba on 7/16/18.
 */
class TestLoginPresenter : RxFixture() {

    @Mock
    private lateinit var view: LoginContract.View

    @Mock
    private lateinit var navigator: LoginContract.Navigator

    @Mock
    private lateinit var authRepo: AuthRepo

    @InjectMocks
    private lateinit var presenter: LoginPresenter

    @Test
    fun `should load login url`() {
        // Given
        val loginUrl = "https://login.me"

        doReturn(false).on(authRepo).hasApiToken
        doReturn(loginUrl).on(authRepo).loginUrl

        // When
        presenter.onViewCreated()

        // Then
        verify(view).loadLoginPage(loginUrl)
    }

    @Test
    fun `should go to boards screen`() {
        // Given
        doReturn(true).on(authRepo).hasApiToken

        // When
        presenter.onViewCreated()

        // Then
        verify(navigator).goToBoards()
    }

    @Test
    fun `should go to boards on success`() {
        // Given
        val secretCode = "secret-code"

        doReturn(complete()).on(authRepo).authenticate(secretCode)

        // When
        presenter.onReceiveLoginCode(secretCode)

        // Then
        verify(navigator).goToBoards()
    }

    @Test
    fun `should show login error on error`() {
        // Given
        val secretCode = "secret-code"

        doReturn(error(Exception())).on(authRepo).authenticate(secretCode)

        // When
        presenter.onReceiveLoginCode(secretCode)

        // Then
        verify(view).showLoginError()
    }

}
