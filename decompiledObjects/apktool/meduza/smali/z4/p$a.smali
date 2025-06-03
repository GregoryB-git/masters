.class public final Lz4/p$a;
.super Lz4/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final e:Ljava/lang/Object;


# instance fields
.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz4/p$a;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv3/r1;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lz4/l;-><init>(Lv3/r1;)V

    iput-object p2, p0, Lz4/p$a;->c:Ljava/lang/Object;

    iput-object p3, p0, Lz4/p$a;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lz4/l;->b:Lv3/r1;

    sget-object v1, Lz4/p$a;->e:Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lz4/p$a;->d:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move-object p1, v1

    :cond_0
    invoke-virtual {v0, p1}, Lv3/r1;->b(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final f(ILv3/r1$b;Z)Lv3/r1$b;
    .locals 1

    iget-object v0, p0, Lz4/l;->b:Lv3/r1;

    invoke-virtual {v0, p1, p2, p3}, Lv3/r1;->f(ILv3/r1$b;Z)Lv3/r1$b;

    iget-object p1, p2, Lv3/r1$b;->b:Ljava/lang/Object;

    iget-object v0, p0, Lz4/p$a;->d:Ljava/lang/Object;

    invoke-static {p1, v0}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    sget-object p1, Lz4/p$a;->e:Ljava/lang/Object;

    iput-object p1, p2, Lv3/r1$b;->b:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz4/l;->b:Lv3/r1;

    invoke-virtual {v0, p1}, Lv3/r1;->l(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lz4/p$a;->d:Ljava/lang/Object;

    invoke-static {p1, v0}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lz4/p$a;->e:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final n(ILv3/r1$c;J)Lv3/r1$c;
    .locals 1

    iget-object v0, p0, Lz4/l;->b:Lv3/r1;

    invoke-virtual {v0, p1, p2, p3, p4}, Lv3/r1;->n(ILv3/r1$c;J)Lv3/r1$c;

    iget-object p1, p2, Lv3/r1$c;->a:Ljava/lang/Object;

    iget-object p3, p0, Lz4/p$a;->c:Ljava/lang/Object;

    invoke-static {p1, p3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lv3/r1$c;->z:Ljava/lang/Object;

    iput-object p1, p2, Lv3/r1$c;->a:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method
