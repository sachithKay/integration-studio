package org.wso2.integrationstudio.gmf.esb.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.wso2.integrationstudio.gmf.esb.diagram.custom.AbstractEndpointOutputConnectorEditPart;
import org.wso2.integrationstudio.gmf.esb.diagram.custom.WestPointerShape;
import org.wso2.integrationstudio.gmf.esb.diagram.edit.policies.AddressEndPointOutputConnector2ItemSemanticEditPolicy;
import org.wso2.integrationstudio.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated NOT
 */
public class AddressEndPointOutputConnector2EditPart extends AbstractEndpointOutputConnectorEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 3648;

    /**
     * @generated
     */
    protected IFigure contentPane;

    /**
     * @generated
     */
    protected IFigure primaryShape;

    /**
     * @generated
     */
    public AddressEndPointOutputConnector2EditPart(View view) {
        super(view);
    }

    /**
     * @generated
     */
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
        installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, getPrimaryDragEditPolicy());
        installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AddressEndPointOutputConnector2ItemSemanticEditPolicy());
        installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
        // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable
        // editpolicies
        // removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
    }

    /**
     * @generated
     */
    protected LayoutEditPolicy createLayoutEditPolicy() {
        org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

            protected EditPolicy createChildEditPolicy(EditPart child) {
                EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (result == null) {
                    result = new NonResizableEditPolicy();
                }
                return result;
            }

            protected Command getMoveChildrenCommand(Request request) {
                return null;
            }

            protected Command getCreateCommand(CreateRequest request) {
                return null;
            }
        };
        return lep;
    }

    /**
     * @generated
     */
    protected IFigure createNodeShape() {
        return primaryShape = new WestPointerFigure();
    }

    /**
     * @generated
     */
    public WestPointerFigure getPrimaryShape() {
        return (WestPointerFigure) primaryShape;
    }

    /**
     * @generated
     */
    protected NodeFigure createNodePlate() {
        DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(12, 10);

        // FIXME: workaround for #154536
        result.getBounds().setSize(result.getPreferredSize());
        return result;
    }

    /**
     * Creates figure for this edit part.
     * 
     * Body of this method does not depend on settings in generation model
     * so you may safely remove <i>generated</i> tag and modify it.
     * 
     * @generated NOT
     */
    protected NodeFigure createNodeFigure() {
        NodeFigure figure = createNodePlate();
        figure.setLayoutManager(new StackLayout());
        IFigure shape = createNodeShapeForward();
        figure.add(shape);
        contentPane = setupContentPane(shape);
        figure_ = figure;
        createNodeShapeReverse();
        return figure;
    }

    /**
     * Default implementation treats passed figure as content pane.
     * Respects layout one may have set for generated figure.
     * 
     * @param nodeShape instance of generated figure class
     * @generated
     */
    protected IFigure setupContentPane(IFigure nodeShape) {
        return nodeShape; // use nodeShape itself as contentPane
    }

    /**
     * @generated
     */
    public IFigure getContentPane() {
        if (contentPane != null) {
            return contentPane;
        }
        return super.getContentPane();
    }

    /**
     * @generated
     */
    protected void setForegroundColor(Color color) {
        if (primaryShape != null) {
            primaryShape.setForegroundColor(color);
        }
    }

    /**
     * @generated
     */
    protected void setBackgroundColor(Color color) {
        if (primaryShape != null) {
            primaryShape.setBackgroundColor(color);
        }
    }

    /**
     * @generated
     */
    protected void setLineWidth(int width) {
        if (primaryShape instanceof Shape) {
            ((Shape) primaryShape).setLineWidth(width);
        }
    }

    /**
     * @generated
     */
    protected void setLineType(int style) {
        if (primaryShape instanceof Shape) {
            ((Shape) primaryShape).setLineStyle(style);
        }
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnSource() {
        ArrayList<IElementType> types = new ArrayList<IElementType>(1);
        types.add(EsbElementTypes.EsbLink_4001);
        return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
        LinkedList<IElementType> types = new LinkedList<IElementType>();
        if (targetEditPart instanceof ProxyInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof ProxyFaultInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof DropMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof PropertyMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof PropertyGroupMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof ThrottleMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof FilterMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof LogMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof EnrichMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof XSLTMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof SwitchMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof SequenceInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof EventMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof EntitlementMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof ClassMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof SpringMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof ScriptMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof FaultMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof XQueryMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof CommandMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof DBLookupMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof DBReportMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof SmooksMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof SendMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof HeaderMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof CloneMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof CacheMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof IterateMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof CalloutMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof TransactionMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof RMSequenceMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof RuleMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof OAuthMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof AggregateMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof StoreMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof BuilderMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof CallTemplateMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof PayloadFactoryMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof EnqueueMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof URLRewriteMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof ValidateMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof RouterMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof ConditionalRouterMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof DefaultEndPointInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof AddressEndPointInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof FailoverEndPointInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof WSDLEndPointInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof LoadBalanceEndPointInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof MessageInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof MergeNodeFirstInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof MergeNodeSecondInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof SequencesInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof DefaultEndPointInputConnector2EditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof AddressEndPointInputConnector2EditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof FailoverEndPointInputConnector2EditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof WSDLEndPointInputConnector2EditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof LoadBalanceEndPointInputConnector2EditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof JsonTransformMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        if (targetEditPart instanceof DSSMediatorInputConnectorEditPart) {
            types.add(EsbElementTypes.EsbLink_4001);
        }
        return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
        LinkedList<IElementType> types = new LinkedList<IElementType>();
        if (relationshipType == EsbElementTypes.EsbLink_4001) {
            types.add(EsbElementTypes.ProxyInputConnector_3003);
            types.add(EsbElementTypes.ProxyFaultInputConnector_3489);
            types.add(EsbElementTypes.DropMediatorInputConnector_3008);
            types.add(EsbElementTypes.PropertyMediatorInputConnector_3033);
            types.add(EsbElementTypes.PropertyGroupMediatorInputConnector_3789);
            types.add(EsbElementTypes.ThrottleMediatorInputConnector_3121);
            types.add(EsbElementTypes.FilterMediatorInputConnector_3010);
            types.add(EsbElementTypes.LogMediatorInputConnector_3018);
            types.add(EsbElementTypes.EnrichMediatorInputConnector_3036);
            types.add(EsbElementTypes.XSLTMediatorInputConnector_3039);
            types.add(EsbElementTypes.SwitchMediatorInputConnector_3042);
            types.add(EsbElementTypes.SequenceInputConnector_3049);
            types.add(EsbElementTypes.EventMediatorInputConnector_3052);
            types.add(EsbElementTypes.EntitlementMediatorInputConnector_3055);
            types.add(EsbElementTypes.ClassMediatorInputConnector_3058);
            types.add(EsbElementTypes.SpringMediatorInputConnector_3061);
            types.add(EsbElementTypes.ScriptMediatorInputConnector_3064);
            types.add(EsbElementTypes.FaultMediatorInputConnector_3067);
            types.add(EsbElementTypes.XQueryMediatorInputConnector_3070);
            types.add(EsbElementTypes.CommandMediatorInputConnector_3073);
            types.add(EsbElementTypes.DBLookupMediatorInputConnector_3076);
            types.add(EsbElementTypes.DBReportMediatorInputConnector_3079);
            types.add(EsbElementTypes.SmooksMediatorInputConnector_3082);
            types.add(EsbElementTypes.SendMediatorInputConnector_3085);
            types.add(EsbElementTypes.HeaderMediatorInputConnector_3100);
            types.add(EsbElementTypes.CloneMediatorInputConnector_3103);
            types.add(EsbElementTypes.CacheMediatorInputConnector_3106);
            types.add(EsbElementTypes.IterateMediatorInputConnector_3109);
            types.add(EsbElementTypes.CalloutMediatorInputConnector_3115);
            types.add(EsbElementTypes.TransactionMediatorInputConnector_3118);
            types.add(EsbElementTypes.RMSequenceMediatorInputConnector_3124);
            types.add(EsbElementTypes.RuleMediatorInputConnector_3127);
            types.add(EsbElementTypes.OAuthMediatorInputConnector_3130);
            types.add(EsbElementTypes.AggregateMediatorInputConnector_3112);
            types.add(EsbElementTypes.StoreMediatorInputConnector_3589);
            types.add(EsbElementTypes.BuilderMediatorInputConnector_3592);
            types.add(EsbElementTypes.CallTemplateMediatorInputConnector_3595);
            types.add(EsbElementTypes.PayloadFactoryMediatorInputConnector_3598);
            types.add(EsbElementTypes.EnqueueMediatorInputConnector_3601);
            types.add(EsbElementTypes.URLRewriteMediatorInputConnector_3621);
            types.add(EsbElementTypes.ValidateMediatorInputConnector_3624);
            types.add(EsbElementTypes.RouterMediatorInputConnector_3629);
            types.add(EsbElementTypes.ConditionalRouterMediatorInputConnector_3636);
            types.add(EsbElementTypes.DefaultEndPointInputConnector_3021);
            types.add(EsbElementTypes.AddressEndPointInputConnector_3030);
            types.add(EsbElementTypes.FailoverEndPointInputConnector_3088);
            types.add(EsbElementTypes.WSDLEndPointInputConnector_3092);
            types.add(EsbElementTypes.LoadBalanceEndPointInputConnector_3095);
            types.add(EsbElementTypes.MessageInputConnector_3046);
            types.add(EsbElementTypes.MergeNodeFirstInputConnector_3014);
            types.add(EsbElementTypes.MergeNodeSecondInputConnector_3015);
            types.add(EsbElementTypes.SequencesInputConnector_3616);
            types.add(EsbElementTypes.DefaultEndPointInputConnector_3644);
            types.add(EsbElementTypes.AddressEndPointInputConnector_3647);
            types.add(EsbElementTypes.FailoverEndPointInputConnector_3650);
            types.add(EsbElementTypes.WSDLEndPointInputConnector_3654);
            types.add(EsbElementTypes.LoadBalanceEndPointInputConnector_3657);
            types.add(EsbElementTypes.JsonTransformMediatorInputConnector_3792);
        }
        return types;
    }

    /**
     * @generated
     */
    public class WestPointerFigure extends WestPointerShape {

        /**
         * @generated
         */
        public WestPointerFigure() {

            this.setBackgroundColor(THIS_BACK);
            this.setPreferredSize(new Dimension(getMapMode().DPtoLP(12), getMapMode().DPtoLP(10)));
        }

    }

    /**
     * @generated
     */
    static final Color THIS_BACK = new Color(null, 50, 50, 50);

}
