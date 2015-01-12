/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.esa.snap.gui.nodes;

import org.esa.beam.framework.datamodel.ProductNodeEvent;

/**
 * A node that represents a group of some elements.
 *
 * @author Norman
 */
class PNGroupNode extends PNNodeBase {

    private final PNNodeSupport nodeSupport;

    PNGroupNode(PNGroup group) {
        super(group);
        setDisplayName(group.getDisplayName());
        setIconBaseWithExtension("org/esa/snap/gui/icons/RsGroup16.gif");
        nodeSupport = PNNodeSupport.create(this, group);
    }

    @Override
    public void nodeChanged(ProductNodeEvent event) {
        nodeSupport.nodeChanged(event);
    }

    @Override
    public void nodeDataChanged(ProductNodeEvent event) {
        nodeSupport.nodeDataChanged(event);
    }

    @Override
    public void nodeAdded(ProductNodeEvent event) {
        nodeSupport.nodeAdded(event);
    }

    @Override
    public void nodeRemoved(ProductNodeEvent event) {
        nodeSupport.nodeRemoved(event);
    }
}
