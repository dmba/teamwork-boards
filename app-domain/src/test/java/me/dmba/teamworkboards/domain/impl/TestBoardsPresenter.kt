package me.dmba.teamworkboards.domain.impl

import io.reactivex.Flowable.error
import me.dmba.teamworkboards.data.model.access.ProjectRepo
import me.dmba.teamworkboards.data.model.entity.Project
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
    private lateinit var projectRepo: ProjectRepo

    @InjectMocks
    private lateinit var presenter: BoardsPresenter

    @Test
    fun `should show user error on failure`() {
        // Given
        doReturn(error<Project>(Exception())).on(projectRepo).getProject()

        // When
        presenter.onStart()

        // Then
        verify(view).showDataFetchError()
    }

}
