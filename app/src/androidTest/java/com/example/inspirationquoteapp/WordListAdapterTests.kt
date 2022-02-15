package com.example.inspirationquoteapp

import android.content.Context
import com.example.inspirationquoteapp.adapter.ItemAdapter
import com.example.inspirationquoteapp.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

/**
 * Unit tests run on the JVM and not on an actual device, so there is no Context.
 * The mock method allows us to create a "mocked" instance of a Context
 * **/

class WordListAdapterTests {

    private val context = mock(Context::class.java)

    @Test
    //to make sure that the size of the adapter is the size of the list that was passed to the adapter
    fun adapter_size() {

        /**
         *  create an instance of ItemAdapter and pass in the list returned by the loadAffirmations() method
         *  in the Datasource class.
         * **/
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        //create an instance of the ItemAdapter, passing in the context and data variables created
        val adapter = ItemAdapter(context, data)

        // returns the size of the adapter
        assertEquals("ItemAdapter does not have correct size", data.size, adapter.itemCount)
    }

    /**
     * First parameter is a string that displays in the test result if the test fails.
     * Second parameter is the expected value. The third parameter is the actual value
     * **/

}