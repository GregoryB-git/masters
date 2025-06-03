.class public abstract Lg1/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/y$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public d:I

.field public e:Landroid/media/VolumeProvider;


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/y;->a:I

    iput p2, p0, Lg1/y;->b:I

    iput p3, p0, Lg1/y;->d:I

    const/4 p1, 0x0

    iput-object p1, p0, Lg1/y;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Landroid/media/VolumeProvider;
    .locals 8

    iget-object v0, p0, Lg1/y;->e:Landroid/media/VolumeProvider;

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Lg1/w;

    iget v4, p0, Lg1/y;->a:I

    iget v5, p0, Lg1/y;->b:I

    iget v6, p0, Lg1/y;->d:I

    iget-object v7, p0, Lg1/y;->c:Ljava/lang/String;

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lg1/w;-><init>(Lg1/y;IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lg1/x;

    iget v1, p0, Lg1/y;->a:I

    iget v2, p0, Lg1/y;->b:I

    iget v3, p0, Lg1/y;->d:I

    invoke-direct {v0, p0, v1, v2, v3}, Lg1/x;-><init>(Lg1/y;III)V

    :goto_0
    iput-object v0, p0, Lg1/y;->e:Landroid/media/VolumeProvider;

    :cond_1
    iget-object v0, p0, Lg1/y;->e:Landroid/media/VolumeProvider;

    return-object v0
.end method

.method public abstract b(I)V
.end method

.method public abstract c(I)V
.end method
