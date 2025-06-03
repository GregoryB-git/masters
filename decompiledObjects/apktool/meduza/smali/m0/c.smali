.class public abstract Lm0/c;
.super Lm0/a;
.source "SourceFile"


# instance fields
.field public p:I

.field public q:I

.field public r:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0, p1}, Lm0/a;-><init>(Landroid/content/Context;)V

    iput p2, p0, Lm0/c;->q:I

    iput p2, p0, Lm0/c;->p:I

    const-string p2, "layout_inflater"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lm0/c;->r:Landroid/view/LayoutInflater;

    return-void
.end method
