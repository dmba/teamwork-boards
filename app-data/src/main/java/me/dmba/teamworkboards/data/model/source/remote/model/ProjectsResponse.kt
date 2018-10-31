package me.dmba.teamworkboards.data.model.source.remote.model

import com.google.gson.annotations.SerializedName


/**
 * Created by dmba on 7/17/18.
 */

data class ProjectsResponse(
    @SerializedName("STATUS") val status: String,
    @SerializedName("projects") val projects: List<Project>
)

data class Project(
    @SerializedName("replyByEmailEnabled") val replyByEmailEnabled: Boolean,
    @SerializedName("starred") val starred: Boolean,
    @SerializedName("show-announcement") val showAnnouncement: Boolean,
    @SerializedName("harvest-timers-enabled") val harvestTimersEnabled: Boolean,
    @SerializedName("status") val status: String,
    @SerializedName("subStatus") val subStatus: String,
    @SerializedName("defaultPrivacy") val defaultPrivacy: String,
    @SerializedName("created-on") val createdOn: String,
    @SerializedName("category") val category: Category,
    @SerializedName("filesAutoNewVersion") val filesAutoNewVersion: Boolean,
    @SerializedName("overview-start-page") val overviewStartPage: String,
    @SerializedName("tags") val tags: List<Any>,
    @SerializedName("logo") val logo: String,
    @SerializedName("startDate") val startDate: String,
    @SerializedName("id") val id: String,
    @SerializedName("last-changed-on") val lastChangedOn: String,
    @SerializedName("endDate") val endDate: String,
    @SerializedName("defaults") val defaults: Defaults,
    @SerializedName("company") val company: Company,
    @SerializedName("tasks-start-page") val tasksStartPage: String,
    @SerializedName("name") val name: String,
    @SerializedName("privacyEnabled") val privacyEnabled: Boolean,
    @SerializedName("description") val description: String,
    @SerializedName("announcement") val announcement: String,
    @SerializedName("isProjectAdmin") val isProjectAdmin: Boolean,
    @SerializedName("start-page") val startPage: String,
    @SerializedName("notifyeveryone") val notifyeveryone: Boolean,
    @SerializedName("announcementHTML") val announcementHTML: String
)

data class Category(
    @SerializedName("name") val name: String,
    @SerializedName("id") val id: String,
    @SerializedName("color") val color: String
)

data class Xero(
    @SerializedName("countrycode") val countrycode: String,
    @SerializedName("enabled") val enabled: Boolean,
    @SerializedName("connected") val connected: String,
    @SerializedName("organisation") val organisation: String,
    @SerializedName("basecurrency") val basecurrency: String
)

data class Defaults(
    @SerializedName("privacy") val privacy: String
)
