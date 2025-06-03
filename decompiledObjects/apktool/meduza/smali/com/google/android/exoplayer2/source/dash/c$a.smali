.class public final Lcom/google/android/exoplayer2/source/dash/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/source/dash/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/dash/c;
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

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/c$a;->a:Lt5/k$a;

    return-void
.end method


# virtual methods
.method public final a(Lt5/e0;Ld5/c;Lc5/a;I[ILr5/h;IJZLjava/util/ArrayList;Lcom/google/android/exoplayer2/source/dash/d$c;Lt5/l0;Lw3/a0;)Lcom/google/android/exoplayer2/source/dash/c;
    .locals 17

    move-object/from16 v0, p13

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/google/android/exoplayer2/source/dash/c$a;->a:Lt5/k$a;

    invoke-interface {v2}, Lt5/k$a;->a()Lt5/k;

    move-result-object v11

    if-eqz v0, :cond_0

    invoke-interface {v11, v0}, Lt5/k;->f(Lt5/l0;)V

    :cond_0
    new-instance v0, Lcom/google/android/exoplayer2/source/dash/c;

    move-object v3, v0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move/from16 v10, p7

    move-wide/from16 v12, p8

    move/from16 v14, p10

    move-object/from16 v15, p11

    move-object/from16 v16, p12

    invoke-direct/range {v3 .. v16}, Lcom/google/android/exoplayer2/source/dash/c;-><init>(Lt5/e0;Ld5/c;Lc5/a;I[ILr5/h;ILt5/k;JZLjava/util/ArrayList;Lcom/google/android/exoplayer2/source/dash/d$c;)V

    return-object v0
.end method
