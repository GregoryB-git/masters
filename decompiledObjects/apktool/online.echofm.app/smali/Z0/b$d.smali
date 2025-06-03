.class public final LZ0/b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:[LZ0/t;

.field public b:Ld0/q;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-array p1, p1, [LZ0/t;

    .line 5
    .line 6
    iput-object p1, p0, LZ0/b$d;->a:[LZ0/t;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, LZ0/b$d;->d:I

    .line 10
    .line 11
    return-void
.end method
