.class public final Lg/x$b;
.super Le0/q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lg/x;


# direct methods
.method public constructor <init>(Lg/x;)V
    .locals 0

    iput-object p1, p0, Lg/x$b;->b:Lg/x;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Le0/q0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lg/x$b;->b:Lg/x;

    const/4 v1, 0x0

    iput-object v1, v0, Lg/x;->u:Lj/g;

    iget-object v0, v0, Lg/x;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
