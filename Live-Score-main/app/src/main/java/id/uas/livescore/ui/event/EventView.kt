package id.uas.livescore.ui.event

import id.uas.livescore.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}