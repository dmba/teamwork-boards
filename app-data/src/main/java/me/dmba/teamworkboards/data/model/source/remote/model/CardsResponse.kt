package me.dmba.teamworkboards.data.model.source.remote.model

import com.google.gson.annotations.SerializedName


/**
 * Created by dmba on 7/17/18.
 */

data class CardsResponse(
    @SerializedName("STATUS") val status: String,
    @SerializedName("column") val column: CardColumn,
    @SerializedName("cards") val cards: List<Card>
)

data class CardColumn(
    @SerializedName("name") val name: String,
    @SerializedName("id") val id: String,
    @SerializedName("color") val color: String
)

data class Card(
    @SerializedName("dueDate") val dueDate: String,
    @SerializedName("canComplete") val canComplete: Boolean,
    @SerializedName("numComments") val numComments: String,
    @SerializedName("taskListId") val taskListId: String,
    @SerializedName("displayOrder") val displayOrder: String,
    @SerializedName("hasTickets") val hasTickets: Boolean,
    @SerializedName("archived") val archived: Boolean,
    @SerializedName("deletedDate") val deletedDate: String,
    @SerializedName("dateUpdated") val dateUpdated: String,
    @SerializedName("dateCompleted") val dateCompleted: String,
    @SerializedName("private") val private: String,
    @SerializedName("projectId") val projectId: String,
    @SerializedName("status") val status: String,
    @SerializedName("numPredecessors") val numPredecessors: String,
    @SerializedName("numDependencies") val numDependencies: String,
    @SerializedName("numAttachments") val numAttachments: String,
    @SerializedName("canEdit") val canEdit: Boolean,
    @SerializedName("tags") val tags: List<Any>,
    @SerializedName("startDate") val startDate: String,
    @SerializedName("id") val id: String,
    @SerializedName("hasLoggedTime") val hasLoggedTime: Boolean,
    @SerializedName("dateCreated") val dateCreated: String,
    @SerializedName("completed") val completed: Boolean,
    @SerializedName("estimatedMinutes") val estimatedMinutes: String,
    @SerializedName("deleted") val deleted: Boolean,
    @SerializedName("taskListName") val taskListName: String,
    @SerializedName("taskStatus") val taskStatus: String,
    @SerializedName("columnId") val columnId: String,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("priority") val priority: String,
    @SerializedName("progress") val progress: String,
    @SerializedName("parentTaskId") val parentTaskId: String,
    @SerializedName("numActiveSubTasks") val numActiveSubTasks: String,
    @SerializedName("assignedPeople") val assignedPeople: List<Any>,
    @SerializedName("taskId") val taskId: String,
    @SerializedName("isRecurring") val isRecurring: Boolean,
    @SerializedName("hasUnreadComments") val hasUnreadComments: Boolean,
    @SerializedName("archivedDate") val archivedDate: String
)
