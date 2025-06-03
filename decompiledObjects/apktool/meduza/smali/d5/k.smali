.class public abstract Ld5/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld5/k$d;,
        Ld5/k$c;,
        Ld5/k$b;,
        Ld5/k$a;,
        Ld5/k$e;
    }
.end annotation


# instance fields
.field public final a:Ld5/i;

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(Ld5/i;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/k;->a:Ld5/i;

    iput-wide p2, p0, Ld5/k;->b:J

    iput-wide p4, p0, Ld5/k;->c:J

    return-void
.end method


# virtual methods
.method public a(Ld5/j;)Ld5/i;
    .locals 0

    iget-object p1, p0, Ld5/k;->a:Ld5/i;

    return-object p1
.end method
