package me.dmba.teamworkboards.domain.extensions

import org.mockito.stubbing.Stubber

/**
 * Created by dmba on 7/16/18.
 */

fun <T> Stubber.on(mock: T): T = `when`(mock)
