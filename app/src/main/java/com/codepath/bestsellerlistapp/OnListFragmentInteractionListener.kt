package com.codepath.bestsellerlistapp

/**
 * This interface is used by the [BestSellerMoviesRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [BestSellerMoviesFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: BestSellerMovie)
}
