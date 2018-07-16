package me.dmba.teamworkboards.data.model.access

import io.reactivex.Single
import me.dmba.teamworkboards.data.model.entity.Account

/**
 * Created by dmba on 7/16/18.
 */
interface AccountRepo {

    fun getAccountDetails(): Single<Account>

}
