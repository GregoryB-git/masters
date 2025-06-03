.class public Lw5/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/nio/ByteBuffer;

.field public b:I

.field public c:J


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw5/c$b;->a:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    iput p2, p0, Lw5/c$b;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, Lw5/c$b;->c:J

    .line 9
    .line 10
    return-void
.end method
