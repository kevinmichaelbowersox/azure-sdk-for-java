// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.ApplicationMetricDescription;
import org.junit.jupiter.api.Assertions;

public final class ApplicationMetricDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationMetricDescription model =
            BinaryData
                .fromString(
                    "{\"name\":\"yaqcslyjpkiidz\",\"maximumCapacity\":5205006651659908970,\"reservationCapacity\":2324400612208346628,\"totalApplicationCapacity\":3061117133295228827}")
                .toObject(ApplicationMetricDescription.class);
        Assertions.assertEquals("yaqcslyjpkiidz", model.name());
        Assertions.assertEquals(5205006651659908970L, model.maximumCapacity());
        Assertions.assertEquals(2324400612208346628L, model.reservationCapacity());
        Assertions.assertEquals(3061117133295228827L, model.totalApplicationCapacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationMetricDescription model =
            new ApplicationMetricDescription()
                .withName("yaqcslyjpkiidz")
                .withMaximumCapacity(5205006651659908970L)
                .withReservationCapacity(2324400612208346628L)
                .withTotalApplicationCapacity(3061117133295228827L);
        model = BinaryData.fromObject(model).toObject(ApplicationMetricDescription.class);
        Assertions.assertEquals("yaqcslyjpkiidz", model.name());
        Assertions.assertEquals(5205006651659908970L, model.maximumCapacity());
        Assertions.assertEquals(2324400612208346628L, model.reservationCapacity());
        Assertions.assertEquals(3061117133295228827L, model.totalApplicationCapacity());
    }
}
