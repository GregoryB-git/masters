.class public Landroidx/fragment/app/n$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/n$m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Landroidx/fragment/app/n$m;
    .locals 1

    .line 1
    new-instance v0, Landroidx/fragment/app/n$m;

    invoke-direct {v0, p1}, Landroidx/fragment/app/n$m;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[Landroidx/fragment/app/n$m;
    .locals 0

    .line 1
    new-array p1, p1, [Landroidx/fragment/app/n$m;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/n$m$a;->a(Landroid/os/Parcel;)Landroidx/fragment/app/n$m;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/n$m$a;->b(I)[Landroidx/fragment/app/n$m;

    move-result-object p1

    return-object p1
.end method
