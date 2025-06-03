.class public final Ll/z$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll/z$g;-><init>(Ll/z;Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ll/z$g;


# direct methods
.method public constructor <init>(Ll/z$g;)V
    .locals 0

    iput-object p1, p0, Ll/z$g$a;->a:Ll/z$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Ll/z$g$a;->a:Ll/z$g;

    iget-object p1, p1, Ll/z$g;->O:Ll/z;

    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    iget-object p1, p0, Ll/z$g$a;->a:Ll/z$g;

    iget-object p1, p1, Ll/z$g;->O:Ll/z;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/z$g$a;->a:Ll/z$g;

    iget-object p4, p1, Ll/z$g;->O:Ll/z;

    iget-object p1, p1, Ll/z$g;->L:Landroid/widget/ListAdapter;

    invoke-interface {p1, p3}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    iget-object p1, p0, Ll/z$g$a;->a:Ll/z$g;

    invoke-virtual {p1}, Ll/n0;->dismiss()V

    return-void
.end method
