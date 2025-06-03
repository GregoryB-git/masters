.class public LD5/q$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD5/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD5/q$d$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:D

.field public final d:D

.field public final e:D

.field public final f:D

.field public final g:I

.field public final h:LD5/q$d$a;

.field public final i:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(ILjava/lang/String;DDDDILD5/q$d$a;Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LD5/q$d;->a:I

    .line 5
    .line 6
    iput-object p2, p0, LD5/q$d;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, LD5/q$d;->e:D

    .line 9
    .line 10
    iput-wide p5, p0, LD5/q$d;->f:D

    .line 11
    .line 12
    iput-wide p7, p0, LD5/q$d;->c:D

    .line 13
    .line 14
    iput-wide p9, p0, LD5/q$d;->d:D

    .line 15
    .line 16
    iput p11, p0, LD5/q$d;->g:I

    .line 17
    .line 18
    iput-object p12, p0, LD5/q$d;->h:LD5/q$d$a;

    .line 19
    .line 20
    iput-object p13, p0, LD5/q$d;->i:Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    return-void
.end method
