package me.dmba.teamworkboards.data.model.source.remote.model

import com.google.gson.annotations.SerializedName

/**
 * Created by dmba on 7/16/18.
 */

data class AccountResponse(
    @SerializedName("STATUS") val status: String,
    @SerializedName("account") val account: Account
)

data class Account(
    @SerializedName("realTimeNotifications") val realTimeNotifications: Boolean,
    @SerializedName("twUsernamePasswordEnabled") val twUsernamePasswordEnabled: Boolean,
    @SerializedName("showSwitchToDotCom") val showSwitchToDotCom: Boolean,
    @SerializedName("sessionTimeoutEnabled") val sessionTimeoutEnabled: Boolean,
    @SerializedName("datesignedup") val datesignedup: String,
    @SerializedName("strictBranding") val strictBranding: Boolean,
    @SerializedName("inGracePeriod") val inGracePeriod: Boolean,
    @SerializedName("isPaid") val isPaid: String,
    @SerializedName("shardNo") val shardNo: String,
    @SerializedName("canPreviewFiles") val canPreviewFiles: Boolean,
    @SerializedName("touchIcon") val touchIcon: String,
    @SerializedName("markdownEnabled") val markdownEnabled: Boolean,
    @SerializedName("logo") val logo: String,
    @SerializedName("chatEnabled") val chatEnabled: Boolean,
    @SerializedName("id") val id: String,
    @SerializedName("TKOEnabled") val tKOEnabled: Boolean,
    @SerializedName("tagsEnabled") val tagsEnabled: Boolean,
    @SerializedName("awsRegion") val awsRegion: String,
    @SerializedName("showSiteNameOnLogin") val showSiteNameOnLogin: Boolean,
    @SerializedName("pricePlan") val pricePlan: String,
    @SerializedName("allowProjectAdminsCreateUsers") val allowProjectAdminsCreateUsers: Boolean,
    @SerializedName("canEditCustomDomain") val canEditCustomDomain: Boolean,
    @SerializedName("code") val code: String,
    @SerializedName("requirehttps") val requirehttps: Boolean,
    @SerializedName("name") val name: String,
    @SerializedName("userIsAdmin") val userIsAdmin: Boolean,
    @SerializedName("trialExpiryDate") val trialExpiryDate: String,
    @SerializedName("companyname") val companyname: String,
    @SerializedName("siteOwnerName") val siteOwnerName: String,
    @SerializedName("canShareFiles") val canShareFiles: Boolean,
    @SerializedName("documentEditorEnabled") val documentEditorEnabled: Boolean,
    @SerializedName("customCSSEnabled") val customCSSEnabled: Boolean,
    @SerializedName("paymentStatus") val paymentStatus: String,
    @SerializedName("cacheUUID") val cacheUUID: String,
    @SerializedName("priceplanType") val priceplanType: String,
    @SerializedName("onTeamworkDomain") val onTeamworkDomain: Boolean,
    @SerializedName("paidUntilDateTime") val paidUntilDateTime: String,
    @SerializedName("documentEditorAvailable") val documentEditorAvailable: Boolean,
    @SerializedName("allowKeepMeLoggedIn") val allowKeepMeLoggedIn: Boolean,
    @SerializedName("webhooksEnabled") val webhooksEnabled: Boolean,
    @SerializedName("email-notification-enabled") val emailNotificationEnabled: Boolean,
    @SerializedName("companyid") val companyid: String,
    @SerializedName("tasklistTemplateProjectId") val tasklistTemplateProjectId: String,
    @SerializedName("billingPeriod") val billingPeriod: String,
    @SerializedName("canUploadFilesDirectly") val canUploadFilesDirectly: Boolean,
    @SerializedName("priceplanCanTurnOffTWBranding") val priceplanCanTurnOffTWBranding: Boolean,
    @SerializedName("passwordPolicyIsOn") val passwordPolicyIsOn: Boolean,
    @SerializedName("officeAddinMSProjectAvailable") val officeAddinMSProjectAvailable: Boolean,
    @SerializedName("projectsNextBillingDate") val projectsNextBillingDate: String,
    @SerializedName("shortcutsAvailable") val shortcutsAvailable: Boolean,
    @SerializedName("RSSEnabled") val rSSEnabled: Boolean,
    @SerializedName("notebooksNewlineMode") val notebooksNewlineMode: Boolean,
    @SerializedName("dashboardMessage") val dashboardMessage: String,
    @SerializedName("integrations") val integrations: Integrations,
    @SerializedName("tagsLockedToAdmins") val tagsLockedToAdmins: Boolean,
    @SerializedName("pricePlanName") val pricePlanName: String,
    @SerializedName("pricePlanId") val pricePlanId: String,
    @SerializedName("priceplanAllowSSL") val priceplanAllowSSL: Boolean,
    @SerializedName("favIcon") val favIcon: String,
    @SerializedName("account-holder-id") val accountHolderId: String,
    @SerializedName("paidForUsers") val paidForUsers: String,
    @SerializedName("corsEnabled") val corsEnabled: Boolean,
    @SerializedName("siteOwnerEmail") val siteOwnerEmail: String,
    @SerializedName("URL") val uRL: String,
    @SerializedName("cleanNotebooksOnPaste") val cleanNotebooksOnPaste: Boolean,
    @SerializedName("sslCustomProxy") val sslCustomProxy: String,
    @SerializedName("trialDaysRemaining") val trialDaysRemaining: String,
    @SerializedName("time-tracking-enabled") val timeTrackingEnabled: Boolean,
    @SerializedName("pdfServerLink") val pdfServerLink: String,
    @SerializedName("dashboardProjectsList") val dashboardProjectsList: String,
    @SerializedName("priceplanMaxUsers") val priceplanMaxUsers: String,
    @SerializedName("SSO") val sSO: SSO,
    @SerializedName("memberOfOwnerCompany") val memberOfOwnerCompany: String,
    @SerializedName("officeAddinAvailable") val officeAddinAvailable: Boolean,
    @SerializedName("lifetimeValue") val lifetimeValue: String,
    @SerializedName("dashboardMessageHTML") val dashboardMessageHTML: String,
    @SerializedName("allowTeamworkProjectsBrand") val allowTeamworkProjectsBrand: Boolean,
    @SerializedName("ssl-enabled") val sslEnabled: Boolean,
    @SerializedName("created-at") val createdAt: String,
    @SerializedName("billingAmount") val billingAmount: String,
    @SerializedName("projectsEnabled") val projectsEnabled: Boolean,
    @SerializedName("customCSSAvailable") val customCSSAvailable: Boolean,
    @SerializedName("isAdmin") val isAdmin: Boolean,
    @SerializedName("portfolioEnabled") val portfolioEnabled: Boolean,
    @SerializedName("customCSS") val customCSS: String,
    @SerializedName("deskEnabled") val deskEnabled: Boolean,
    @SerializedName("likesEnabled") val likesEnabled: Boolean,
    @SerializedName("betaFeaturesEnabled") val betaFeaturesEnabled: Boolean,
    @SerializedName("lang") val lang: String,
    @SerializedName("priceplanData") val priceplanData: PriceplanData
)

data class Integrations(
    @SerializedName("clockInOut") val clockInOut: ClockInOut,
    @SerializedName("googleSignIn") val googleSignIn: GoogleSignIn,
    @SerializedName("hubSpot") val hubSpot: HubSpot,
    @SerializedName("microsoftConnectors") val microsoftConnectors: MicrosoftConnectors,
    @SerializedName("onedrivebusiness") val onedrivebusiness: Onedrivebusiness,
    @SerializedName("yoxelSync") val yoxelSync: YoxelSync
)

data class GoogleSignIn(
    @SerializedName("enabled") val enabled: Boolean
)

data class Onedrivebusiness(
    @SerializedName("enabled") val enabled: Boolean,
    @SerializedName("available") val available: Boolean
)

data class ClockInOut(
    @SerializedName("enabled") val enabled: Boolean
)

data class YoxelSync(
    @SerializedName("enabled") val enabled: Boolean,
    @SerializedName("available") val available: Boolean
)

data class HubSpot(
    @SerializedName("enabled") val enabled: Boolean,
    @SerializedName("portalId") val portalId: String
)

data class MicrosoftConnectors(
    @SerializedName("enabled") val enabled: Boolean,
    @SerializedName("available") val available: Boolean
)

data class PriceplanData(
    @SerializedName("name") val name: String,
    @SerializedName("features") val features: Features,
    @SerializedName("id") val id: String,
    @SerializedName("type") val type: String,
    @SerializedName("code") val code: String
)

data class Features(
    @SerializedName("shortcuts") val shortcuts: Boolean,
    @SerializedName("exportsingleproject") val exportsingleproject: Boolean,
    @SerializedName("sso") val sso: Boolean,
    @SerializedName("officeaddin") val officeaddin: Boolean,
    @SerializedName("exportallprojects") val exportallprojects: Boolean,
    @SerializedName("createbyemail") val createbyemail: Boolean,
    @SerializedName("microsoftconnector") val microsoftconnector: Boolean,
    @SerializedName("2fa") val fa: Boolean,
    @SerializedName("customdomain") val customdomain: Boolean,
    @SerializedName("hubspot") val hubspot: Boolean,
    @SerializedName("portfolio") val portfolio: Boolean,
    @SerializedName("onedrivebusinessfiles") val onedrivebusinessfiles: Boolean,
    @SerializedName("doceditor") val doceditor: Boolean,
    @SerializedName("dropbox") val dropbox: Boolean,
    @SerializedName("officeaddinmsproject") val officeaddinmsproject: Boolean,
    @SerializedName("projectupdates") val projectupdates: Boolean,
    @SerializedName("riskregister") val riskregister: Boolean,
    @SerializedName("onedrivefiles") val onedrivefiles: Boolean,
    @SerializedName("googlecalsync") val googlecalsync: Boolean,
    @SerializedName("webhooks") val webhooks: Boolean,
    @SerializedName("loginhistory") val loginhistory: Boolean,
    @SerializedName("yoxelsync") val yoxelsync: Boolean,
    @SerializedName("boxfiles") val boxfiles: Boolean,
    @SerializedName("googledocs") val googledocs: Boolean
)

data class SSO(
    @SerializedName("available") val available: Boolean
)
