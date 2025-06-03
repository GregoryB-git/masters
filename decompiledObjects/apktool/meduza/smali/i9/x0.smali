.class public final Li9/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/b0;


# instance fields
.field public final a:Li9/y0;


# direct methods
.method public constructor <init>(Li9/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/x0;->a:Li9/y0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Li9/x0;->a:Li9/y0;

    new-instance v1, Lb/k;

    const/16 v2, 0xe

    invoke-direct {v1, p0, v2}, Lb/k;-><init>(Ljava/lang/Object;I)V

    const-string v2, "build overlays"

    invoke-virtual {v0, v2, v1}, Li9/y0;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method
