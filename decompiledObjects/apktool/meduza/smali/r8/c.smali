.class public final Lr8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr8/c$b;,
        Lr8/c$a;
    }
.end annotation


# instance fields
.field public final a:Lr8/c$b;

.field public final b:Lr8/c$a;

.field public final c:J

.field public final d:D

.field public final e:D

.field public final f:I


# direct methods
.method public constructor <init>(JLr8/c$b;Lr8/c$a;DDI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lr8/c;->c:J

    iput-object p3, p0, Lr8/c;->a:Lr8/c$b;

    iput-object p4, p0, Lr8/c;->b:Lr8/c$a;

    iput-wide p5, p0, Lr8/c;->d:D

    iput-wide p7, p0, Lr8/c;->e:D

    iput p9, p0, Lr8/c;->f:I

    return-void
.end method
