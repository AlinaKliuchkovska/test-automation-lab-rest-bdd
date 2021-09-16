package utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class Listener extends RunListener {
    private static final Logger LOG = LogManager.getLogger(Listener.class);

    public void onFinish(Description description) {
        LOG.info("Test suite finished: " + description);
    }

    public void onStart(Description description) {
        LOG.info("Test suite started" + description);
    }

    public void onTestFailure(Description description) {
        LOG.error("Test failed: " + description.getMethodName());
    }

    public void onTestSkipped(Description description) {
        LOG.warn("Test skipped: " + description.getMethodName());
    }

    public void onTestStart(Description description) {
        LOG.info("Test started: " + description.getMethodName());
    }

    public void onTestSuccess(Description description) {
        LOG.info("Test passed: " + description.getMethodName());
    }
}