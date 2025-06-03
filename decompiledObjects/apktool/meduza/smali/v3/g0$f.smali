.class public final Lv3/g0$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:Lz4/t$b;

.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:Z

.field public final f:Z


# direct methods
.method public constructor <init>(Lz4/t$b;JJZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/g0$f;->a:Lz4/t$b;

    iput-wide p2, p0, Lv3/g0$f;->b:J

    iput-wide p4, p0, Lv3/g0$f;->c:J

    iput-boolean p6, p0, Lv3/g0$f;->d:Z

    iput-boolean p7, p0, Lv3/g0$f;->e:Z

    iput-boolean p8, p0, Lv3/g0$f;->f:Z

    return-void
.end method
