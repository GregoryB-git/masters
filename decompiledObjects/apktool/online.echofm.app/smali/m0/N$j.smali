.class public final Lm0/N$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation


# instance fields
.field public final a:Ld0/C;

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(Ld0/C;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/N$j;->a:Ld0/C;

    iput-wide p2, p0, Lm0/N$j;->b:J

    iput-wide p4, p0, Lm0/N$j;->c:J

    return-void
.end method

.method public synthetic constructor <init>(Ld0/C;JJLm0/N$a;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p5}, Lm0/N$j;-><init>(Ld0/C;JJ)V

    return-void
.end method
