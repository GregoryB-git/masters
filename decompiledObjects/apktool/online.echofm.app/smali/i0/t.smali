.class public final Li0/t;
.super Li0/r;
.source "SourceFile"


# instance fields
.field public final r:I

.field public final s:Ljava/lang/String;

.field public final t:Ljava/util/Map;

.field public final u:[B


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/io/IOException;Ljava/util/Map;Li0/k;[B)V
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Response code: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/16 v6, 0x7d4

    .line 19
    .line 20
    const/4 v7, 0x1

    .line 21
    move-object v2, p0

    .line 22
    move-object v4, p3

    .line 23
    move-object v5, p5

    .line 24
    invoke-direct/range {v2 .. v7}, Li0/r;-><init>(Ljava/lang/String;Ljava/io/IOException;Li0/k;II)V

    .line 25
    .line 26
    .line 27
    iput p1, p0, Li0/t;->r:I

    .line 28
    .line 29
    iput-object p2, p0, Li0/t;->s:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p4, p0, Li0/t;->t:Ljava/util/Map;

    .line 32
    .line 33
    iput-object p6, p0, Li0/t;->u:[B

    .line 34
    .line 35
    return-void
.end method
