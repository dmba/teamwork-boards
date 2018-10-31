package me.dmba.teamworkboards.data.model.source.remote.api

import io.reactivex.Flowable
import me.dmba.teamworkboards.data.model.source.remote.model.CardsResponse
import me.dmba.teamworkboards.data.model.source.remote.model.ColumnsResponse
import me.dmba.teamworkboards.data.model.source.remote.model.ProjectsResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by dmba on 7/16/18.
 */
internal interface ProjectService {

    @GET("projects.json")
    fun getProjects(): Flowable<ProjectsResponse>

        @GET("projects/{id}/boards/columns.json")
    fun getProjectColumns(@Path("id") projectId: String): Flowable<ColumnsResponse>

    @GET("boards/columns/{id}/cards.json")
    fun getCardsForColumn(@Path("id") columnId: String): Flowable<CardsResponse>

}
