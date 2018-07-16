package me.dmba.teamworkboards.domain.fixtures

import me.dmba.teamworkboards.domain.rules.RxImmediateSchedulerRule
import org.junit.Rule
import org.junit.rules.TestRule
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoRule

/**
 * Created by dmba on 7/16/18.
 */
abstract class RxFixture {

    @get:Rule
    val mockitoJUnitRule: MockitoRule = MockitoJUnit.rule()

    @get:Rule
    val immediateSchedulerRule: TestRule = RxImmediateSchedulerRule()

}
