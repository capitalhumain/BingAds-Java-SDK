package com.microsoft.bingads.v10.api.test.entities.ad_extension.callout.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v10.api.test.entities.ad_extension.callout.BulkCalloutAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCalloutAdExtension;
import com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class BulkCalloutAdExtensionReadFromRowValuesStatusTest extends BulkCalloutAdExtensionTest {

    @Parameter(value = 1)
    public AdExtensionStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Active", AdExtensionStatus.ACTIVE},
                {"Deleted", AdExtensionStatus.DELETED},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkCalloutAdExtension, AdExtensionStatus>() {
            @Override
            public AdExtensionStatus apply(BulkCalloutAdExtension c) {
                return c.getCalloutAdExtension().getStatus();
            }
        });
    }
}
