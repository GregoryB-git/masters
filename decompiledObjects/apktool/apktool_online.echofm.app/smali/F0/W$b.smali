.class public final LF0/W$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(ZIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LF0/W$b;->a:Z

    .line 5
    .line 6
    iput p2, p0, LF0/W$b;->b:I

    .line 7
    .line 8
    iput p3, p0, LF0/W$b;->c:I

    .line 9
    .line 10
    iput p4, p0, LF0/W$b;->d:I

    .line 11
    .line 12
    return-void
.end method
