.class public final Lw/d$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(IIILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lw/d$d;->a:Ljava/lang/String;

    iput p1, p0, Lw/d$d;->b:I

    iput-boolean p6, p0, Lw/d$d;->c:Z

    iput-object p5, p0, Lw/d$d;->d:Ljava/lang/String;

    iput p2, p0, Lw/d$d;->e:I

    iput p3, p0, Lw/d$d;->f:I

    return-void
.end method
