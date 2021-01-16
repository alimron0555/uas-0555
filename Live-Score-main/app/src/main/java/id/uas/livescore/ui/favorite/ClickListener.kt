package id.uas.livescore.ui.favorite

import id.uas.livescore.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}