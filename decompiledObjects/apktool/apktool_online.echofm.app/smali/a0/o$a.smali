.class public La0/o$a;
.super Landroid/media/VolumeProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/o;->c()Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La0/o;


# direct methods
.method public constructor <init>(La0/o;IIILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/o$a;->a:La0/o;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, p4, p5}, Landroid/media/VolumeProvider;-><init>(IIILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAdjustVolume(I)V
    .locals 1

    .line 1
    iget-object v0, p0, La0/o$a;->a:La0/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La0/o;->d(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onSetVolumeTo(I)V
    .locals 1

    .line 1
    iget-object v0, p0, La0/o$a;->a:La0/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La0/o;->e(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
