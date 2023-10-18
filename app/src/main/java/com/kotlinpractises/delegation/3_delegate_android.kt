package com.kotlinpractises.delegation

/*
LiveData = Delegates.observable
class MainActivity : AppCompatActivity() {

    private val textView: TextView by lazy { textview }
    private var text: String by Delegates.observable("") { _, _, newValue ->
        textView.text = newValue
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = "NewText"
    }
}
 */