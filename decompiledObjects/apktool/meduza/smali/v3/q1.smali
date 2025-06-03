.class public final Lv3/q1;
.super Lv3/i1;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final o:Le0/d;


# instance fields
.field public final c:Z

.field public final d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/q1;->e:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/q1;->f:Ljava/lang/String;

    new-instance v0, Le0/d;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Le0/d;-><init>(I)V

    sput-object v0, Lv3/q1;->o:Le0/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lv3/i1;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv3/q1;->c:Z

    iput-boolean v0, p0, Lv3/q1;->d:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Lv3/i1;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv3/q1;->c:Z

    iput-boolean p1, p0, Lv3/q1;->d:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lv3/q1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lv3/q1;

    iget-boolean v0, p0, Lv3/q1;->d:Z

    iget-boolean v2, p1, Lv3/q1;->d:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Lv3/q1;->c:Z

    iget-boolean p1, p1, Lv3/q1;->c:Z

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-boolean v1, p0, Lv3/q1;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lv3/q1;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
