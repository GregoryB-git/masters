.class public final Lnb/i$g$a;
.super Leb/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/i$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Lnb/i$a;

.field public final b:Leb/h$a;


# direct methods
.method public constructor <init>(Lnb/i$a;Leb/h$a;)V
    .locals 0

    invoke-direct {p0}, Leb/h$a;-><init>()V

    iput-object p1, p0, Lnb/i$g$a;->a:Lnb/i$a;

    iput-object p2, p0, Lnb/i$g$a;->b:Leb/h$a;

    return-void
.end method


# virtual methods
.method public final a(Leb/h$b;Leb/s0;)Leb/h;
    .locals 1

    iget-object v0, p0, Lnb/i$g$a;->b:Leb/h$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Leb/h$a;->a(Leb/h$b;Leb/s0;)Leb/h;

    move-result-object p1

    new-instance p2, Lnb/i$g$a$a;

    invoke-direct {p2, p0, p1}, Lnb/i$g$a$a;-><init>(Lnb/i$g$a;Leb/h;)V

    return-object p2

    :cond_0
    new-instance p1, Lnb/i$g$a$b;

    invoke-direct {p1, p0}, Lnb/i$g$a$b;-><init>(Lnb/i$g$a;)V

    return-object p1
.end method
