package me.dmba.teamworkboards.di.screens

import android.support.v7.widget.RecyclerView.RecycledViewPool
import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntKey
import dagger.multibindings.IntoMap
import me.dmba.teamworkboards.di.utils.ForFragment
import me.dmba.teamworkboards.screens.boards.adapter.*
import me.dmba.teamworkboards.screens.boards.column.ColumnProviderDefault
import me.dmba.teamworkboards.screens.boards.column.ColumnProviderFactory

/**
 * Created by dmba on 7/19/18.
 */
@Module(
    includes = [
        FragmentBoardsModuleBindings::class
    ]
)
object FragmentBoardsModule {

    @Provides
    @JvmStatic
    @ForFragment
    fun provideRecycledViewPool(): RecycledViewPool = RecycledViewPool()

}

@AssistedModule
@Module(
    includes = [
        AssistedInject_FragmentBoardsModuleBindings::class
    ]
)
interface FragmentBoardsModuleBindings {

    @Binds
    @ForFragment
    fun bindDefaultColumnProviderFactory(factory: ColumnProviderDefault.Factory): ColumnProviderFactory

    @Binds
    @IntKey(CARD_TYPE_DEFAULT)
    @IntoMap
    @ForFragment
    fun bindDefaultCardFactory(factory: CardViewHolderDefault.Factory): CardViewHolderFactory

    @Binds
    @IntKey(CARD_TYPE_WITH_ATTACHMENTS)
    @IntoMap
    @ForFragment
    fun bindCardWithAttachmentsFactory(factory: CardViewHolderWithAttachments.Factory): CardViewHolderFactory

}
