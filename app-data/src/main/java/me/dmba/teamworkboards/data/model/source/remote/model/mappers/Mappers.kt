package me.dmba.teamworkboards.data.model.source.remote.model.mappers

import me.dmba.teamworkboards.data.model.entity.Account
import me.dmba.teamworkboards.data.model.source.remote.model.AccountResponse

/**
 * Created by dmba on 7/16/18.
 */

fun mapResponseToAccount(response: AccountResponse) = Account(
    id = response.account.accountHolderId,
    user = response.account.siteOwnerName
)
