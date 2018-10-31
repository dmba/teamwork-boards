package me.dmba.teamworkboards.data.model.source.remote.model

import com.google.gson.annotations.SerializedName

/**
 * Created by dmba on 7/17/18.
 */

data class ColumnsResponse(
    @SerializedName("columns") val columns: List<Column>,
    @SerializedName("defaultColumns") val defaultColumns: DefaultColumns,
    @SerializedName("STATUS") val status: String
)

data class Column(
    @SerializedName("name") val name: String,
    @SerializedName("displayOrder") val displayOrder: String,
    @SerializedName("sortOrder") val sortOrder: String,
    @SerializedName("deletedDate") val deletedDate: String,
    @SerializedName("dateUpdated") val dateUpdated: String,
    @SerializedName("settings") val settings: Settings,
    @SerializedName("projectId") val projectId: String,
    @SerializedName("hasTriggers") val hasTriggers: Boolean,
    @SerializedName("sort") val sort: String,
    @SerializedName("canEdit") val canEdit: Boolean,
    @SerializedName("triggers") val triggers: List<Any>,
    @SerializedName("id") val id: String,
    @SerializedName("dateCreated") val dateCreated: String,
    @SerializedName("color") val color: String,
    @SerializedName("deleted") val deleted: Boolean,
    @SerializedName("canAddCards") val canAddCards: Boolean
)

data class Settings(
    @SerializedName("time") val time: Boolean,
    @SerializedName("avatar") val avatar: Boolean,
    @SerializedName("name") val name: Boolean,
    @SerializedName("files") val files: Boolean,
    @SerializedName("comments") val comments: Boolean,
    @SerializedName("priority") val priority: Boolean,
    @SerializedName("progress") val progress: Boolean,
    @SerializedName("subtasktext") val subtasktext: Boolean,
    @SerializedName("tasklist") val tasklist: Boolean,
    @SerializedName("private") val private: Boolean,
    @SerializedName("reminders") val reminders: Boolean,
    @SerializedName("assignee") val assignee: Boolean,
    @SerializedName("dependencies") val dependencies: Boolean,
    @SerializedName("tags") val tags: Boolean,
    @SerializedName("estimatedtime") val estimatedtime: Boolean,
    @SerializedName("startdate") val startdate: Boolean,
    @SerializedName("tickets") val tickets: Boolean,
    @SerializedName("followers") val followers: Boolean,
    @SerializedName("recurring") val recurring: Boolean,
    @SerializedName("subtasklabel") val subtasklabel: Boolean,
    @SerializedName("enddate") val enddate: Boolean
)

data class DefaultColumns(
    @SerializedName("count") val count: String
)
