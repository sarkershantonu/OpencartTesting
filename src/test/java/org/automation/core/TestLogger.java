package org.automation.core;

import org.junit.rules.TestWatcher;

/**
 * Created by shantonu on 3/15/17.
 */
public class TestLogger extends TestWatcher {
    private static Logger logger;

    public LoggingRule(Logger logger) {
        this.logger = logger;
    }

    @Override
    protected void starting(Description description) {
        super.starting(description);
        logger.info("TEST Started : "+ description.getMethodName());
    }

    /**
     * Invoked when a test method finishes (whether passing or failing)
     */
    @Override
    protected void finished(Description description) {
        super.finished(description);
        logger.info("TEST COMPLETE : "+ description.getMethodName());
    }

    /**
     * invoke for test pass
     * @param description
     */
    @Override
    protected void succeeded(Description description) {
        super.succeeded(description);

        logger.info("TEST SUCCESS : "+ description.getMethodName());
    }

    /**
     * Invoked when a test fails
     */

    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e,description);
        logger.error("TEST FAILED >>> "+ description.getMethodName() +" and the Test Class ="+description.getClassName()+" , \n ERROR = "+ e.getMessage());
    }

}
