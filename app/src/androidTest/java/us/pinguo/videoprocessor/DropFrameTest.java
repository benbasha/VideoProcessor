package us.pinguo.videoprocessor;

import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

import com.hw.videoprocessor.util.CL;
import com.hw.videoprocessor.util.FrameDropper;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class DropFrameTest {

    @org.junit.Test
    public void test() throws Exception {
        CL.setLogEnable(true);
        doTest(600,60,24);
    }

    private void doTest(int totalFrame,int srcFrameRate,int targetFrameRate){
        FrameDropper dropper = new FrameDropper(srcFrameRate,targetFrameRate);
        CL.i("totalFrame:"+totalFrame+",srcFrameRate:"+srcFrameRate+",targetFrameRate:"+targetFrameRate);
        for(int i=0;i<totalFrame;i++){
            boolean drop = dropper.checkDrop(i);
            CL.i("第"+i+"帧,drop:"+drop);
        }
        dropper.printResult();
    }
}
