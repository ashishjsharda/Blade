
package blade;

import com.blade.Blade;

import io.netty.bootstrap.Bootstrap;

/**
 * Using Blade Framework
 * @author asharda
 *
 */
public class App extends Bootstrap{

	public static void main(String[] args) {

		 Blade.of().get("/", ctx ->ctx.text("Hello Blade")).start();
	}

}
