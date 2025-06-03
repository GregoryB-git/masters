.class public final Lg1/w;
.super Landroid/media/VolumeProvider;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lg1/y;


# direct methods
.method public constructor <init>(Lg1/y;IIILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lg1/w;->a:Lg1/y;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/media/VolumeProvider;-><init>(IIILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onAdjustVolume(I)V
    .locals 1

    iget-object v0, p0, Lg1/w;->a:Lg1/y;

    invoke-virtual {v0, p1}, Lg1/y;->b(I)V

    return-void
.end method

.method public final onSetVolumeTo(I)V
    .locals 1

    iget-object v0, p0, Lg1/w;->a:Lg1/y;

    invoke-virtual {v0, p1}, Lg1/y;->c(I)V

    return-void
.end method
