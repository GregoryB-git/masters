.class public final Lr5/f$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/Spatializer$OnSpatializerStateChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr5/f$f;->b(Lr5/f;Landroid/os/Looper;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lr5/f;


# direct methods
.method public constructor <init>(Lr5/f;)V
    .locals 0

    iput-object p1, p0, Lr5/f$f$a;->a:Lr5/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onSpatializerAvailableChanged(Landroid/media/Spatializer;Z)V
    .locals 0

    iget-object p1, p0, Lr5/f$f$a;->a:Lr5/f;

    sget-object p2, Lr5/f;->j:Lo7/k0;

    invoke-virtual {p1}, Lr5/f;->j()V

    return-void
.end method

.method public final onSpatializerEnabledChanged(Landroid/media/Spatializer;Z)V
    .locals 0

    iget-object p1, p0, Lr5/f$f$a;->a:Lr5/f;

    sget-object p2, Lr5/f;->j:Lo7/k0;

    invoke-virtual {p1}, Lr5/f;->j()V

    return-void
.end method
