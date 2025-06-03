.class public final LY1/u$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY1/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY1/u$f$a;,
        LY1/u$f$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LY1/u$f;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final w:LY1/u$f$c;


# instance fields
.field public final o:LY1/u$f$a;

.field public final p:Lx1/a;

.field public final q:Lx1/i;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;

.field public final t:LY1/u$e;

.field public u:Ljava/util/Map;

.field public v:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY1/u$f$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY1/u$f$c;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY1/u$f;->w:LY1/u$f$c;

    .line 8
    .line 9
    new-instance v0, LY1/u$f$b;

    .line 10
    .line 11
    invoke-direct {v0}, LY1/u$f$b;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LY1/u$f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(LY1/u$e;LY1/u$f$a;Lx1/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, LY1/u$f;-><init>(LY1/u$e;LY1/u$f$a;Lx1/a;Lx1/i;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(LY1/u$e;LY1/u$f$a;Lx1/a;Lx1/i;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY1/u$f;->t:LY1/u$e;

    iput-object p3, p0, LY1/u$f;->p:Lx1/a;

    iput-object p4, p0, LY1/u$f;->q:Lx1/i;

    iput-object p5, p0, LY1/u$f;->r:Ljava/lang/String;

    iput-object p2, p0, LY1/u$f;->o:LY1/u$f$a;

    iput-object p6, p0, LY1/u$f;->s:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "error"

    :cond_0
    invoke-static {v0}, LY1/u$f$a;->valueOf(Ljava/lang/String;)LY1/u$f$a;

    move-result-object v0

    iput-object v0, p0, LY1/u$f;->o:LY1/u$f$a;

    const-class v0, Lx1/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lx1/a;

    iput-object v0, p0, LY1/u$f;->p:Lx1/a;

    const-class v0, Lx1/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lx1/i;

    iput-object v0, p0, LY1/u$f;->q:Lx1/i;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LY1/u$f;->r:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LY1/u$f;->s:Ljava/lang/String;

    const-class v0, LY1/u$e;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, LY1/u$e;

    iput-object v0, p0, LY1/u$f;->t:LY1/u$e;

    invoke-static {p1}, LO1/P;->r0(Landroid/os/Parcel;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, LY1/u$f;->u:Ljava/util/Map;

    invoke-static {p1}, LO1/P;->r0(Landroid/os/Parcel;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LY1/u$f;->v:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, LY1/u$f;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    const-string v0, "dest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY1/u$f;->o:LY1/u$f$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LY1/u$f;->p:Lx1/a;

    .line 16
    .line 17
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LY1/u$f;->q:Lx1/i;

    .line 21
    .line 22
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, LY1/u$f;->r:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, LY1/u$f;->s:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, LY1/u$f;->t:LY1/u$e;

    .line 36
    .line 37
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 38
    .line 39
    .line 40
    sget-object p2, LO1/P;->a:LO1/P;

    .line 41
    .line 42
    iget-object p2, p0, LY1/u$f;->u:Ljava/util/Map;

    .line 43
    .line 44
    invoke-static {p1, p2}, LO1/P;->G0(Landroid/os/Parcel;Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    iget-object p2, p0, LY1/u$f;->v:Ljava/util/Map;

    .line 48
    .line 49
    invoke-static {p1, p2}, LO1/P;->G0(Landroid/os/Parcel;Ljava/util/Map;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
