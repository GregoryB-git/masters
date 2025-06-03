.class public final Landroidx/recyclerview/widget/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/q$a;
    }
.end annotation


# instance fields
.field public final a:Lr/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/h<",
            "Landroidx/recyclerview/widget/RecyclerView$v;",
            "Landroidx/recyclerview/widget/q$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lr/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/e<",
            "Landroidx/recyclerview/widget/RecyclerView$v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr/h;

    invoke-direct {v0}, Lr/h;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/q;->a:Lr/h;

    new-instance v0, Lr/e;

    invoke-direct {v0}, Lr/e;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/q;->b:Lr/e;

    return-void
.end method
