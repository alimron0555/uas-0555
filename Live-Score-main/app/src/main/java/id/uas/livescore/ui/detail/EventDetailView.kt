package id.uas.livescore.ui.detail


import id.uas.livescore.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}