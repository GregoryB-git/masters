.class public final LZ0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/Q;


# instance fields
.field public final a:I

.field public final b:La3/e;


# direct methods
.method public constructor <init>(I[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LZ0/w;->a:I

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-static {p2}, La3/e;->a([I)La3/e;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, La3/e;->f()La3/e;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    iput-object p1, p0, LZ0/w;->b:La3/e;

    .line 18
    .line 19
    return-void
.end method
