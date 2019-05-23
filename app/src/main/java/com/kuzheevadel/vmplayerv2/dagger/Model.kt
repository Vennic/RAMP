package com.kuzheevadel.vmplayerv2.dagger

import android.arch.lifecycle.ViewModel
import com.kuzheevadel.vmplayerv2.viewmodels.*
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class Model {

    @Binds
    @IntoMap
    @ViewModelKey(AlbumViewModel::class)
    abstract fun albumViewModel(albumViewModel: AlbumViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AllTracksViewModel::class)
    abstract fun allTracksViewModel(allTracksViewModel: AllTracksViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PlaybackViewModel::class)
    abstract fun playbackViewModel(playbackViewModel: PlaybackViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DetailAlbumViewModel::class)
    abstract fun detailViewModel(detailViewModel: DetailAlbumViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RadioViewModel::class)
    abstract fun radioViewModel(radioViewModel: RadioViewModel): ViewModel
}