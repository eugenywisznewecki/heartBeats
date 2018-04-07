package freelpy.freelpy.com.heartanimation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val animation = AnimationUtils.loadAnimation(this, R.anim.translatealpha)
		animation.interpolator = MyInterpolator()

		imageViewW.startAnimation(animation)
		//changes
	}
}
