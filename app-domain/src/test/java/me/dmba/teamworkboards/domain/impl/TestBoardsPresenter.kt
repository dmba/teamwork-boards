package me.dmba.teamworkboards.domain.impl

import io.reactivex.Single.error
import io.reactivex.Single.just
import me.dmba.teamworkboards.data.model.access.AccountRepo
import me.dmba.teamworkboards.data.model.entity.Account
import me.dmba.teamworkboards.domain.contract.BoardsContract
import me.dmba.teamworkboards.domain.extensions.on
import me.dmba.teamworkboards.domain.fixtures.RxFixture
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.doReturn
import org.mockito.Mockito.verify

/**
 * Created by dmba on 7/17/18.
 */
class TestBoardsPresenter : RxFixture() {

    @Mock
    private lateinit var view: BoardsContract.View

    @Mock
    private lateinit var navigator: BoardsContract.Navigator

    @Mock
    private lateinit var accountRepo: AccountRepo

    @InjectMocks
    private lateinit var presenter: BoardsPresenter

    @Test
    fun `should show user name on success`() {
        // Given
        val account = Account(
            id = "user-id",
            user = "User Name"
        )

        doReturn(just(account)).on(accountRepo).getAccountDetails()

        // When
        presenter.onViewCreated()

        // Then
        verify(view).showGreetingTo(account.user)
    }

    @Test
    fun `should show user error on failure`() {
        // Given
        doReturn(error<Account>(Exception())).on(accountRepo).getAccountDetails()

        // When
        presenter.onViewCreated()

        // Then
        verify(view).showDataFetchError()
    }

}
