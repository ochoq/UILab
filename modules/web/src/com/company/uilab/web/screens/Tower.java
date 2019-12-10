package com.company.uilab.web.screens;

import com.company.uilab.entity.NewEntity;
import com.haulmont.charts.gui.components.charts.SerialChart;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import org.apache.commons.lang3.RandomUtils;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@UiController("uilab_Tower")
@UiDescriptor("Tower.xml")
public class Tower extends Screen {
    List<NewEntity> items = new ArrayList<>();
    @Inject
    private Metadata metadata;
    @Inject
    private CollectionContainer<NewEntity> newEntitiesDc;
    @Inject
    private SerialChart grfData;

    public void onBtnLoadClick() {
        // generate data


        for (int j = 0; j < 3; j++) {
            NewEntity ne = metadata.create(NewEntity.class);
            ne.setSerie1(RandomUtils.nextInt(0, 100));
            switch (j) {
                case 0:
                    ne.setLabel("label 1");
                    break;
                case 1:
                    ne.setLabel("label 2");
                    break;
                case 2:
                    ne.setLabel("label 3");
                    break;
                default:
                    break;
            }

            items.add(ne);
        }
        newEntitiesDc.setItems(items);
        grfData.repaint();
    }

    public void onBtnDeleteClick() {
        newEntitiesDc.setItems(null);
        items = new ArrayList<>();
        grfData.repaint();
    }
}