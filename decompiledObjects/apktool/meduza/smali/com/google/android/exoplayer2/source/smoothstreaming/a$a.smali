.class public final Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/smoothstreaming/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lt5/k$a;


# direct methods
.method public constructor <init>(Lt5/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;->a:Lt5/k$a;

    return-void
.end method


# virtual methods
.method public final a(Lt5/e0;Lg5/a;ILr5/h;Lt5/l0;)Lcom/google/android/exoplayer2/source/smoothstreaming/a;
    .locals 7

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;->a:Lt5/k$a;

    invoke-interface {v0}, Lt5/k$a;->a()Lt5/k;

    move-result-object v6

    if-eqz p5, :cond_0

    invoke-interface {v6, p5}, Lt5/k;->f(Lt5/l0;)V

    :cond_0
    new-instance p5, Lcom/google/android/exoplayer2/source/smoothstreaming/a;

    move-object v1, p5

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/exoplayer2/source/smoothstreaming/a;-><init>(Lt5/e0;Lg5/a;ILr5/h;Lt5/k;)V

    return-object p5
.end method
